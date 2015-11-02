/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateKeyDeleteRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ProductRateKeyDeleteRequest Udt Request
 *
 */

public class ProductRateKeyDeleteRequest extends ProductRateKeyRequest {
/**
 *
 * Constructor to create a  ProductRateKeyDeleteRequest
 * @param id Unique request name
 * @param PRKDeleteIn ProductRateKeyObjectKeyData for ProductRateKeyDeleteRequest
 * @param PRKCeaseDate Date for ProductRateKeyDeleteRequest
 *
 */
@JsonCreator
  public ProductRateKeyDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductRateKey")ProductRateKeyObjectKeyData PRKDeleteIn, @JsonProperty("InactiveDate")Date PRKCeaseDate) {
    super(id, "ProductRateKeyDelete");
    if (PRKDeleteIn != null) {
      addInput("ProductRateKey", ProductRateKeyObjectKeyHelper.toMap(PRKDeleteIn, new HashMap(), "ProductRateKeyObjectKeyData").get("ProductRateKeyObjectKeyData"));
    }
    if (PRKCeaseDate != null) {
      addInput("InactiveDate", PRKCeaseDate);
    }
  }

}
