/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentDefFindEligibleRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.bp.data.*;
import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a PackageComponentDefFindEligibleRequest Udt Request
 *
 */

public class PackageComponentDefFindEligibleRequest extends ProductCatalogRequest {
/**
 *
 * Constructor to create a  PackageComponentDefFindEligibleRequest
 * @param id Unique request name
 * @param ______entity EntityObjectData[] for PackageComponentDefFindEligibleRequest
 * @param package_component_def PCDObjectFilter for PackageComponentDefFindEligibleRequest
 * @param ______address_id Integer for PackageComponentDefFindEligibleRequest
 * @param ______industry_type Integer[] for PackageComponentDefFindEligibleRequest
 * @param ______effective_date Date for PackageComponentDefFindEligibleRequest
 * @param ______check_type Integer for PackageComponentDefFindEligibleRequest
 *
 */
@JsonCreator
  public PackageComponentDefFindEligibleRequest(@JsonProperty("RequestId") String id, @JsonProperty("Entity")EntityObjectData[] ______entity, @JsonProperty("PackageComponentDef")PCDObjectFilter package_component_def, @JsonProperty("AddressId")Integer ______address_id, @JsonProperty("IndustryType")Integer[] ______industry_type, @JsonProperty("EffectiveDate")Date ______effective_date, @JsonProperty("CheckType")Integer ______check_type) {
    super(id, "PackageComponentDefFindEligible");
    if (______entity != null) {
      Object[] list = new Object[______entity.length];
      for (int i = 0; i < ______entity.length; i++) {
        list[i] = EntityObjectHelper.getMap(______entity[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Entity");
      }
      addInput("EntityList", list);
    }
    if (package_component_def != null) {
      Integer index =  package_component_def.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PackageComponentDef", PCDObjectHelper.toMap(package_component_def, new HashMap(), "PackageComponentDef").get("PackageComponentDef"));
    }
    if (______address_id != null) {
      addInput("AddressId", ______address_id);
    }
    if (______industry_type != null) {
      addInput("IndustryTypeList", ______industry_type);
    }
    if (______effective_date != null) {
      addInput("EffectiveDate", ______effective_date);
    }
    if (______check_type != null) {
      addInput("CheckType", ______check_type);
    }
  }

/**
 *
 * Retrieves the PCDObjectDataList that results from the PackageComponentDefFindEligibleRequest call
 * @return PCDObjectDataList resulting from udt call
 *
 */

  public PCDObjectDataList getOutput() {
    return PCDObjectHelper.fromMapList(outputMap, "PackageComponentDefList");
  }
}
