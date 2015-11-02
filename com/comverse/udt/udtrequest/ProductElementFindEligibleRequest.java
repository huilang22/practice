/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductElementFindEligibleRequest.java
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
 * Class used to create a ProductElementFindEligibleRequest Udt Request
 *
 */

public class ProductElementFindEligibleRequest extends ProductCatalogRequest {
/**
 *
 * Constructor to create a  ProductElementFindEligibleRequest
 * @param id Unique request name
 * @param __entity EntityObjectData[] for ProductElementFindEligibleRequest
 * @param product_element ProductElementObjectFilter for ProductElementFindEligibleRequest
 * @param address_id Integer for ProductElementFindEligibleRequest
 * @param industry_type Integer[] for ProductElementFindEligibleRequest
 * @param __effective_date Date for ProductElementFindEligibleRequest
 * @param ___check_type Integer for ProductElementFindEligibleRequest
 *
 */
@JsonCreator
  public ProductElementFindEligibleRequest(@JsonProperty("RequestId") String id, @JsonProperty("Entity")EntityObjectData[] __entity, @JsonProperty("ProductElement")ProductElementObjectFilter product_element, @JsonProperty("AddressId")Integer address_id, @JsonProperty("IndustryType")Integer[] industry_type, @JsonProperty("EffectiveDate")Date __effective_date, @JsonProperty("CheckType")Integer ___check_type) {
    super(id, "ProductElementFindEligible");
    if (__entity != null) {
      Object[] list = new Object[__entity.length];
      for (int i = 0; i < __entity.length; i++) {
        list[i] = EntityObjectHelper.getMap(__entity[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Entity");
      }
      addInput("EntityList", list);
    }
    if (product_element != null) {
      Integer index =  product_element.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductElement", ProductElementObjectHelper.toMap(product_element, new HashMap(), "ProductElement").get("ProductElement"));
    }
    if (address_id != null) {
      addInput("AddressId", address_id);
    }
    if (industry_type != null) {
      addInput("IndustryTypeList", industry_type);
    }
    if (__effective_date != null) {
      addInput("EffectiveDate", __effective_date);
    }
    if (___check_type != null) {
      addInput("CheckType", ___check_type);
    }
  }

/**
 *
 * Retrieves the ProductElementObjectDataList that results from the ProductElementFindEligibleRequest call
 * @return ProductElementObjectDataList resulting from udt call
 *
 */

  public ProductElementObjectDataList getOutput() {
    return ProductElementObjectHelper.fromMapList(outputMap, "ProductElementList");
  }
}
