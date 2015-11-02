/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTaxGetRequest.java
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
 * Class used to create a AdjustmentTaxGetRequest Udt Request
 *
 */

public class AdjustmentTaxGetRequest extends AdjustmentTaxSubRequestParent {
/**
 *
 * Constructor to create a  AdjustmentTaxGetRequest
 * @param id Unique request name
 * @param ATGetIn AdjustmentTaxObjectKeyData for AdjustmentTaxGetRequest
 *
 */
@JsonCreator
  public AdjustmentTaxGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AdjustmentTax")AdjustmentTaxObjectKeyData ATGetIn) {
    super(id, "AdjustmentTaxGet");
    if (ATGetIn != null) {
      addInput("AdjustmentTax", AdjustmentTaxObjectKeyHelper.toMap(ATGetIn, new HashMap(), "AdjustmentTaxObjectKeyData").get("AdjustmentTaxObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AdjustmentTaxObjectData that results from the AdjustmentTaxGetRequest call
 * @return AdjustmentTaxObjectData resulting from udt call
 *
 */

  public AdjustmentTaxObjectData getOutput() {
    return AdjustmentTaxObjectHelper.fromMap(outputMap, "AdjustmentTax");
  }
}
