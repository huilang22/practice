/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PpvOfferValidateRequest.java
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
import com.csgsystems.ctc.data.*;
import com.csgsystems.om.data.*;
import com.csgsystems.ppv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a PpvOfferValidateRequest Udt Request
 *
 */

public class PpvOfferValidateRequest extends PpvSubRequestParent {
/**
 *
 * Constructor to create a  PpvOfferValidateRequest
 * @param id Unique request name
 * @param ___AccountIn PpvAccountObjectData for PpvOfferValidateRequest
 * @param Offer CtcOfferObjectData for PpvOfferValidateRequest
 * @param OrderMethod CtcOrderMethodObjectData for PpvOfferValidateRequest
 * @param IgnoreOrderMethod Boolean for PpvOfferValidateRequest
 * @param IgnoreOrderWindow Boolean for PpvOfferValidateRequest
 * @param CurrencyCode Integer for PpvOfferValidateRequest
 * @param QuickOrderCode String for PpvOfferValidateRequest
 *
 */
@JsonCreator
  public PpvOfferValidateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountIn")PpvAccountObjectData ___AccountIn, @JsonProperty("Offer")CtcOfferObjectData Offer, @JsonProperty("OrderMethod")CtcOrderMethodObjectData OrderMethod, @JsonProperty("IgnoreOrderMethod")Boolean IgnoreOrderMethod, @JsonProperty("IgnoreOrderWindow")Boolean IgnoreOrderWindow, @JsonProperty("CurrencyCode")Integer CurrencyCode, @JsonProperty("QuickOrderCode")String QuickOrderCode) {
    super(id, "PpvOfferValidate");
    if (___AccountIn != null) {
      addInput("AccountIn", PpvAccountObjectHelper.toMap(___AccountIn, new HashMap(), "AccountOut").get("AccountOut"));
    }
    if (Offer != null) {
      addInput("Offer", CtcOfferObjectHelper.toMap(Offer, new HashMap(), "AccountOut").get("AccountOut"));
    }
    if (OrderMethod != null) {
      addInput("OrderMethod", CtcOrderMethodObjectHelper.toMap(OrderMethod, new HashMap(), "AccountOut").get("AccountOut"));
    }
    if (IgnoreOrderMethod != null) {
      addInput("IgnoreOrderMethod", IgnoreOrderMethod);
    }
    if (IgnoreOrderWindow != null) {
      addInput("IgnoreOrderWindow", IgnoreOrderWindow);
    }
    if (CurrencyCode != null) {
      addInput("CurrencyCode", CurrencyCode);
    }
    if (QuickOrderCode != null) {
      addInput("QuickOrderCode", QuickOrderCode);
    }
  }

/**
 *
 * Retrieves the PpvAccountObjectData that results from the PpvOfferValidateRequest call
 * @return PpvAccountObjectData resulting from udt call
 *
 */

  public PpvAccountObjectData getOutput() {
    return PpvAccountObjectHelper.fromMap(outputMap, "AccountOut");
  }
}
