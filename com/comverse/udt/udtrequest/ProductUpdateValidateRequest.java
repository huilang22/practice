/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductUpdateValidateRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ProductUpdateValidateRequest Udt Request
 *
 */

public class ProductUpdateValidateRequest extends ProductRequest {
/**
 *
 * Constructor to create a  ProductUpdateValidateRequest
 * @param id Unique request name
 * @param ProdUpdValidateIn ProductObjectData for ProductUpdateValidateRequest
 * @param EffectiveDt Date for ProductUpdateValidateRequest
 *
 */
@JsonCreator
  public ProductUpdateValidateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Product")ProductObjectData ProdUpdValidateIn, @JsonProperty("EffectiveDt")Date EffectiveDt) {
    super(id, "ProductUpdateValidate");
    if (ProdUpdValidateIn != null) {
      addInput("Product", ProductObjectHelper.toMap(ProdUpdValidateIn, new HashMap(), "Void").get("Void"));
    }
    if (EffectiveDt != null) {
      addInput("EffectiveDt", EffectiveDt);
    }
  }

}
