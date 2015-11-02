/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxRatesVatGetRequest.java
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
 * Class used to create a TaxRatesVatGetRequest Udt Request
 *
 */

public class TaxRatesVatGetRequest extends TaxRatesVatSubRequestParent {
/**
 *
 * Constructor to create a  TaxRatesVatGetRequest
 * @param id Unique request name
 * @param TRVgetIn TaxRatesVatObjectKeyData for TaxRatesVatGetRequest
 *
 */
@JsonCreator
  public TaxRatesVatGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("TaxRatesVat")TaxRatesVatObjectKeyData TRVgetIn) {
    super(id, "TaxRatesVatGet");
    if (TRVgetIn != null) {
      addInput("TaxRatesVat", TaxRatesVatObjectKeyHelper.toMap(TRVgetIn, new HashMap(), "TaxRatesVatObjectKeyData").get("TaxRatesVatObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the TaxRatesVatObjectData that results from the TaxRatesVatGetRequest call
 * @return TaxRatesVatObjectData resulting from udt call
 *
 */

  public TaxRatesVatObjectData getOutput() {
    return TaxRatesVatObjectHelper.fromMap(outputMap, "TaxRatesVat");
  }
}
