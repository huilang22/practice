/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductDisconnectValidateRequest.java
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
 * Class used to create a ProductDisconnectValidateRequest Udt Request
 *
 */

public class ProductDisconnectValidateRequest extends ProductRequest {
/**
 *
 * Constructor to create a  ProductDisconnectValidateRequest
 * @param id Unique request name
 * @param ProdDiscValidateIn ProductObjectData for ProductDisconnectValidateRequest
 *
 */
@JsonCreator
  public ProductDisconnectValidateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Product")ProductObjectData ProdDiscValidateIn) {
    super(id, "ProductDisconnectValidate");
    if (ProdDiscValidateIn != null) {
      addInput("Product", ProductObjectHelper.toMap(ProdDiscValidateIn, new HashMap(), "Void").get("Void"));
    }
  }

}
