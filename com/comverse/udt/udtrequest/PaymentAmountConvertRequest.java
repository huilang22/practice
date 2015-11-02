/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentAmountConvertRequest.java
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
 * Class used to create a PaymentAmountConvertRequest Udt Request
 *
 */

public class PaymentAmountConvertRequest extends PaymentRequest {
/**
 *
 * Constructor to create a  PaymentAmountConvertRequest
 * @param id Unique request name
 * @param charge_type Integer for PaymentAmountConvertRequest
 * @param conversion_date Date for PaymentAmountConvertRequest
 * @param currency_code Integer for PaymentAmountConvertRequest
 * @param exrate_class Integer for PaymentAmountConvertRequest
 * @param external_amount BigInteger for PaymentAmountConvertRequest
 * @param external_currency Integer for PaymentAmountConvertRequest
 *
 */
@JsonCreator
  public PaymentAmountConvertRequest(@JsonProperty("RequestId") String id, @JsonProperty("ChargeType")Integer charge_type, @JsonProperty("ConversionDate")Date conversion_date, @JsonProperty("CurrencyCode")Integer currency_code, @JsonProperty("ExrateClass")Integer exrate_class, @JsonProperty("ExternalAmount")BigInteger external_amount, @JsonProperty("ExternalCurrency")Integer external_currency) {
    super(id, "PaymentAmountConvert");
    if (charge_type != null) {
      addInput("ChargeType", charge_type);
    }
    if (conversion_date != null) {
      addInput("ConversionDate", conversion_date);
    }
    if (currency_code != null) {
      addInput("CurrencyCode", currency_code);
    }
    if (exrate_class != null) {
      addInput("ExrateClass", exrate_class);
    }
    if (external_amount != null) {
      addInput("ExternalAmount", external_amount);
    }
    if (external_currency != null) {
      addInput("ExternalCurrency", external_currency);
    }
  }

/**
 *
 * Retrieves the BigInteger that results from the PaymentAmountConvertRequest call
 * @return BigInteger resulting from udt call
 *
 */

  public BigInteger getOutput() {
    return  (BigInteger)outputMap.get("TransAmount");
  }
}
