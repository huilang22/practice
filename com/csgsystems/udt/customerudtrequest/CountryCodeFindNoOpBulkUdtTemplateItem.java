/*
 * Generated code DO NOT EDIT
 * Generated file: CountryCodeFindNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a CountryCodeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CountryCodeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CountryCodeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CountryCodeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CountryCodeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CountryCodeObjectDataList noOpInIn) {
    super(id, context, "CountryCodeFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = CountryCodeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CountryCode", noOpIn);
      }
      addInput("CountryCode", mapList);
    }
  }
/**
 *
 * Sets the  CountryCode
 * @param noOpInIn CountryCodeObjectDataList to set
 *
 */
  public void setCountryCode(CountryCodeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CountryCode passed into the constructor
 * @return Simulated response
 *
 */
  public CountryCodeObjectDataList getCountryCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CountryCodeObjectHelper.fromMapList(inputMap, "CountryCodeList");
  }
}
