/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductElementFindByAccountRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ProductElementFindByAccountRequest Udt Request
 *
 */

public class ProductElementFindByAccountRequest extends ProductElementRequest {
/**
 *
 * Constructor to create a  ProductElementFindByAccountRequest
 * @param id Unique request name
 * @param language_code Integer for ProductElementFindByAccountRequest
 * @param account_internal_id Integer for ProductElementFindByAccountRequest
 *
 */
@JsonCreator
  public ProductElementFindByAccountRequest(@JsonProperty("RequestId") String id, @JsonProperty("LanguageCode")Integer language_code, @JsonProperty("AccountInternalId")Integer account_internal_id) {
    super(id, "ProductElementFindByAccount");
    if (language_code != null) {
      addInput("LanguageCode", language_code);
    }
    if (account_internal_id != null) {
      addInput("AccountInternalId", account_internal_id);
    }
  }

/**
 *
 * Retrieves the ProductElementObjectDataList that results from the ProductElementFindByAccountRequest call
 * @return ProductElementObjectDataList resulting from udt call
 *
 */

  public ProductElementObjectDataList getOutput() {
    return ProductElementObjectHelper.fromMapList(outputMap, "ProductElementList");
  }
}
