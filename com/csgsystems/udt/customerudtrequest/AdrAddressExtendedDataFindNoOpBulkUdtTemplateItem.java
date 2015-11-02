/*
 * Generated code DO NOT EDIT
 * Generated file: AdrAddressExtendedDataFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a AdrAddressExtendedDataFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AdrAddressExtendedDataFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AdrAddressEDObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AdrAddressExtendedDataFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AdrAddressExtendedDataFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AdrAddressEDObjectDataList noOpInIn) {
    super(id, context, "AdrAddressExtendedDataFind");
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
        mapArray[i] = AdrAddressEDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AdrAddressExtendedData", noOpIn);
      }
      addInput("AdrAddressExtendedData", mapList);
    }
  }
/**
 *
 * Sets the  AdrAddressExtendedData
 * @param noOpInIn AdrAddressEDObjectDataList to set
 *
 */
  public void setAdrAddressExtendedData(AdrAddressEDObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AdrAddressExtendedData passed into the constructor
 * @return Simulated response
 *
 */
  public AdrAddressEDObjectDataList getAdrAddressExtendedData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AdrAddressEDObjectHelper.fromMapList(inputMap, "AdrAddressExtendedDataList");
  }
}
