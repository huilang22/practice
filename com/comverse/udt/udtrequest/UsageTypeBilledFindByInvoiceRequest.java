/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeBilledFindByInvoiceRequest.java
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
 * Class used to create a UsageTypeBilledFindByInvoiceRequest Udt Request
 *
 */

public class UsageTypeBilledFindByInvoiceRequest extends UsageTypeRequest {
/**
 *
 * Constructor to create a  UsageTypeBilledFindByInvoiceRequest
 * @param id Unique request name
 * @param language_code Integer for UsageTypeBilledFindByInvoiceRequest
 * @param bill_ref_no Integer for UsageTypeBilledFindByInvoiceRequest
 * @param bill_ref_resets Integer for UsageTypeBilledFindByInvoiceRequest
 *
 */
@JsonCreator
  public UsageTypeBilledFindByInvoiceRequest(@JsonProperty("RequestId") String id, @JsonProperty("LanguageCode")Integer language_code, @JsonProperty("BillRefNo")Integer bill_ref_no, @JsonProperty("BillRefResets")Integer bill_ref_resets) {
    super(id, "UsageTypeBilledFindByInvoice");
    if (language_code != null) {
      addInput("LanguageCode", language_code);
    }
    if (bill_ref_no != null) {
      addInput("BillRefNo", bill_ref_no);
    }
    if (bill_ref_resets != null) {
      addInput("BillRefResets", bill_ref_resets);
    }
  }

/**
 *
 * Retrieves the UsageTypeObjectDataList that results from the UsageTypeBilledFindByInvoiceRequest call
 * @return UsageTypeObjectDataList resulting from udt call
 *
 */

  public UsageTypeObjectDataList getOutput() {
    return UsageTypeObjectHelper.fromMapList(outputMap, "UsageTypeList");
  }
}
