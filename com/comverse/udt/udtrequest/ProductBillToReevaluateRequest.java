/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductBillToReevaluateRequest.java
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
 * Class used to create a ProductBillToReevaluateRequest Udt Request
 *
 */

public class ProductBillToReevaluateRequest extends ProductSubRequestParent {
/**
 *
 * Constructor to create a  ProductBillToReevaluateRequest
 * @param id Unique request name
 * @param ProductReIn ProductObjectBaseKeyData for ProductBillToReevaluateRequest
 * @param billing_account_internal_id Integer for ProductBillToReevaluateRequest
 * @param open_item_id Integer for ProductBillToReevaluateRequest
 * @param effective_date Date for ProductBillToReevaluateRequest
 * @param reevaluation_date Date for ProductBillToReevaluateRequest
 *
 */
@JsonCreator
  public ProductBillToReevaluateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Product")ProductObjectBaseKeyData ProductReIn, @JsonProperty("BillingAccountInternalId")Integer billing_account_internal_id, @JsonProperty("OpenItemId")Integer open_item_id, @JsonProperty("EffectiveDate")Date effective_date, @JsonProperty("ReevaluationDate")Date reevaluation_date) {
    super(id, "ProductBillToReevaluate");
    if (ProductReIn != null) {
      addInput("Product", ProductObjectBaseKeyHelper.toMap(ProductReIn, new HashMap(), "ProductObjectBaseKeyData").get("ProductObjectBaseKeyData"));
    }
    if (billing_account_internal_id != null) {
      addInput("BillingAccountInternalId", billing_account_internal_id);
    }
    if (open_item_id != null) {
      addInput("OpenItemId", open_item_id);
    }
    if (effective_date != null) {
      addInput("EffectiveDate", effective_date);
    }
    if (reevaluation_date != null) {
      addInput("ReevaluationDate", reevaluation_date);
    }
  }

/**
 *
 * Retrieves the ProductObjectBaseData that results from the ProductBillToReevaluateRequest call
 * @return ProductObjectBaseData resulting from udt call
 *
 */

  public ProductObjectBaseData getOutput() {
    return ProductObjectBaseHelper.fromMap(outputMap, "Product");
  }
}
