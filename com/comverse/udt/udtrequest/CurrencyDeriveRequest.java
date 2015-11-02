/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CurrencyDeriveRequest.java
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
 * Class used to create a CurrencyDeriveRequest Udt Request
 *
 */

public class CurrencyDeriveRequest extends ProductRequest {
/**
 *
 * Constructor to create a  CurrencyDeriveRequest
 * @param id Unique request name
 * @param account_currency_code Integer for CurrencyDeriveRequest
 * @param bill_country_code Integer for CurrencyDeriveRequest
 * @param cust_country_code Integer for CurrencyDeriveRequest
 * @param service_currency_code Integer for CurrencyDeriveRequest
 * @param service_country_code Integer for CurrencyDeriveRequest
 * @param b_service_country_code Integer for CurrencyDeriveRequest
 * @param type_code Integer for CurrencyDeriveRequest
 * @param subtype_code Integer for CurrencyDeriveRequest
 *
 */
@JsonCreator
  public CurrencyDeriveRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountCurrencyCode")Integer account_currency_code, @JsonProperty("BillCountryCode")Integer bill_country_code, @JsonProperty("CustCountryCode")Integer cust_country_code, @JsonProperty("ServiceCurrencyCode")Integer service_currency_code, @JsonProperty("ServiceCountryCode")Integer service_country_code, @JsonProperty("BServiceCountryCode")Integer b_service_country_code, @JsonProperty("TypeCode")Integer type_code, @JsonProperty("SubtypeCode")Integer subtype_code) {
    super(id, "CurrencyDerive");
    if (account_currency_code != null) {
      addInput("AccountCurrencyCode", account_currency_code);
    }
    if (bill_country_code != null) {
      addInput("BillCountryCode", bill_country_code);
    }
    if (cust_country_code != null) {
      addInput("CustCountryCode", cust_country_code);
    }
    if (service_currency_code != null) {
      addInput("ServiceCurrencyCode", service_currency_code);
    }
    if (service_country_code != null) {
      addInput("ServiceCountryCode", service_country_code);
    }
    if (b_service_country_code != null) {
      addInput("BServiceCountryCode", b_service_country_code);
    }
    if (type_code != null) {
      addInput("TypeCode", type_code);
    }
    if (subtype_code != null) {
      addInput("SubtypeCode", subtype_code);
    }
  }

/**
 *
 * Retrieves the Integer that results from the CurrencyDeriveRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("CurrencyCode");
  }
}
