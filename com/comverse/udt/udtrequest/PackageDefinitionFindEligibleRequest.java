/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageDefinitionFindEligibleRequest.java
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
 * Class used to create a PackageDefinitionFindEligibleRequest Udt Request
 *
 */

public class PackageDefinitionFindEligibleRequest extends ProductCatalogRequest {
/**
 *
 * Constructor to create a  PackageDefinitionFindEligibleRequest
 * @param id Unique request name
 * @param ___entity EntityObjectData[] for PackageDefinitionFindEligibleRequest
 * @param package_definition PDObjectFilter for PackageDefinitionFindEligibleRequest
 * @param ___address_id Integer for PackageDefinitionFindEligibleRequest
 * @param ___industry_type Integer[] for PackageDefinitionFindEligibleRequest
 * @param ___effective_date Date for PackageDefinitionFindEligibleRequest
 * @param level Integer for PackageDefinitionFindEligibleRequest
 * @param ____check_type Integer for PackageDefinitionFindEligibleRequest
 *
 */
@JsonCreator
  public PackageDefinitionFindEligibleRequest(@JsonProperty("RequestId") String id, @JsonProperty("Entity")EntityObjectData[] ___entity, @JsonProperty("PackageDefinition")PDObjectFilter package_definition, @JsonProperty("AddressId")Integer ___address_id, @JsonProperty("IndustryType")Integer[] ___industry_type, @JsonProperty("EffectiveDate")Date ___effective_date, @JsonProperty("Level")Integer level, @JsonProperty("CheckType")Integer ____check_type) {
    super(id, "PackageDefinitionFindEligible");
    if (___entity != null) {
      Object[] list = new Object[___entity.length];
      for (int i = 0; i < ___entity.length; i++) {
        list[i] = EntityObjectHelper.getMap(___entity[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Entity");
      }
      addInput("EntityList", list);
    }
    if (package_definition != null) {
      Integer index =  package_definition.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PackageDefinition", PDObjectHelper.toMap(package_definition, new HashMap(), "PackageDefinition").get("PackageDefinition"));
    }
    if (___address_id != null) {
      addInput("AddressId", ___address_id);
    }
    if (___industry_type != null) {
      addInput("IndustryTypeList", ___industry_type);
    }
    if (___effective_date != null) {
      addInput("EffectiveDate", ___effective_date);
    }
    if (level != null) {
      addInput("Level", level);
    }
    if (____check_type != null) {
      addInput("CheckType", ____check_type);
    }
  }

/**
 *
 * Retrieves the PDObjectDataList that results from the PackageDefinitionFindEligibleRequest call
 * @return PDObjectDataList resulting from udt call
 *
 */

  public PDObjectDataList getOutput() {
    return PDObjectHelper.fromMapList(outputMap, "PackageDefinitionList");
  }
}
