/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxRatesVatFindRequest.java
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
 * Class used to create a TaxRatesVatFindRequest Udt Request
 *
 */

public class TaxRatesVatFindRequest extends TaxRatesVatRequest {
/**
 *
 * Constructor to create a  TaxRatesVatFindRequest
 * @param id Unique request name
 * @param TRVfindIn TaxRatesVatObjectFilter for TaxRatesVatFindRequest
 *
 */
@JsonCreator
  public TaxRatesVatFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("TaxRatesVat")TaxRatesVatObjectFilter TRVfindIn) {
    super(id, "TaxRatesVatFind");
    if (TRVfindIn != null) {
      Integer index =  TRVfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("TaxRatesVat", TaxRatesVatObjectHelper.toMap(TRVfindIn, new HashMap(), "TaxRatesVat").get("TaxRatesVat"));
    }
  }

/**
 *
 * Retrieves the TaxRatesVatObjectDataList that results from the TaxRatesVatFindRequest call
 * @return TaxRatesVatObjectDataList resulting from udt call
 *
 */

  public TaxRatesVatObjectDataList getOutput() {
    return TaxRatesVatObjectHelper.fromMapList(outputMap, "TaxRatesVatList");
  }
}
