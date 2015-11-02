/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PpvOrderItemAssembleRequest.java
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
 * Class used to create a PpvOrderItemAssembleRequest Udt Request
 *
 */

public class PpvOrderItemAssembleRequest extends PpvSubRequestParent {
/**
 *
 * Constructor to create a  PpvOrderItemAssembleRequest
 * @param id Unique request name
 * @param ____AccountIn PpvAccountObjectData for PpvOrderItemAssembleRequest
 * @param _Offer CtcOfferObjectData for PpvOrderItemAssembleRequest
 * @param _OrderMethod CtcOrderMethodObjectData for PpvOrderItemAssembleRequest
 * @param _IgnoreOrderMethod Boolean for PpvOrderItemAssembleRequest
 * @param _IgnoreOrderWindow Boolean for PpvOrderItemAssembleRequest
 * @param _CurrencyCode Integer for PpvOrderItemAssembleRequest
 * @param _QuickOrderCode String for PpvOrderItemAssembleRequest
 *
 */
@JsonCreator
  public PpvOrderItemAssembleRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountIn")PpvAccountObjectData ____AccountIn, @JsonProperty("Offer")CtcOfferObjectData _Offer, @JsonProperty("OrderMethod")CtcOrderMethodObjectData _OrderMethod, @JsonProperty("IgnoreOrderMethod")Boolean _IgnoreOrderMethod, @JsonProperty("IgnoreOrderWindow")Boolean _IgnoreOrderWindow, @JsonProperty("CurrencyCode")Integer _CurrencyCode, @JsonProperty("QuickOrderCode")String _QuickOrderCode) {
    super(id, "PpvOrderItemAssemble");
    if (____AccountIn != null) {
      addInput("AccountIn", PpvAccountObjectHelper.toMap(____AccountIn, new HashMap(), "AccountOut").get("AccountOut"));
    }
    if (_Offer != null) {
      addInput("Offer", CtcOfferObjectHelper.toMap(_Offer, new HashMap(), "AccountOut").get("AccountOut"));
    }
    if (_OrderMethod != null) {
      addInput("OrderMethod", CtcOrderMethodObjectHelper.toMap(_OrderMethod, new HashMap(), "AccountOut").get("AccountOut"));
    }
    if (_IgnoreOrderMethod != null) {
      addInput("IgnoreOrderMethod", _IgnoreOrderMethod);
    }
    if (_IgnoreOrderWindow != null) {
      addInput("IgnoreOrderWindow", _IgnoreOrderWindow);
    }
    if (_CurrencyCode != null) {
      addInput("CurrencyCode", _CurrencyCode);
    }
    if (_QuickOrderCode != null) {
      addInput("QuickOrderCode", _QuickOrderCode);
    }
  }

/**
 *
 * Retrieves the PpvAccountObjectData that results from the PpvOrderItemAssembleRequest call
 * @return PpvAccountObjectData resulting from udt call
 *
 */

  public PpvAccountObjectData getOutput() {
    return PpvAccountObjectHelper.fromMap(outputMap, "AccountOut");
  }
}
