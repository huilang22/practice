/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxRatesVatFindNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a TaxRatesVatFindNoOpRequest Udt Request/Response
 *
 */
public class TaxRatesVatFindNoOpRequest extends TaxRatesVatRequest {
/**
 *
 * Constructor to create a   TaxRatesVatFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public TaxRatesVatFindNoOpRequest(String id, TaxRatesVatObjectDataList noOpIn) {
    super(id, "TaxRatesVatFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = TaxRatesVatObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("TaxRatesVat", noOpIn);
      }
      addInput("TaxRatesVat", mapList);
    }
  }
/**
 *
 * Retrieves the TaxRatesVatObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public TaxRatesVatObjectDataList getOutput() {
    return TaxRatesVatObjectHelper.fromMapList(outputMap, "TaxRatesVatList");
  }
}
