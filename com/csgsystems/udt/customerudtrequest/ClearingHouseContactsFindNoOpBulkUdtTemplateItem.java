/*
 * Generated code DO NOT EDIT
 * Generated file: ClearingHouseContactsFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a ClearingHouseContactsFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ClearingHouseContactsFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ClearingHouseContactsObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ClearingHouseContactsFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ClearingHouseContactsFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ClearingHouseContactsObjectDataList noOpInIn) {
    super(id, context, "ClearingHouseContactsFind");
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
        mapArray[i] = ClearingHouseContactsObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ClearingHouseContacts", noOpIn);
      }
      addInput("ClearingHouseContacts", mapList);
    }
  }
/**
 *
 * Sets the  ClearingHouseContacts
 * @param noOpInIn ClearingHouseContactsObjectDataList to set
 *
 */
  public void setClearingHouseContacts(ClearingHouseContactsObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ClearingHouseContacts passed into the constructor
 * @return Simulated response
 *
 */
  public ClearingHouseContactsObjectDataList getClearingHouseContacts() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ClearingHouseContactsObjectHelper.fromMapList(inputMap, "ClearingHouseContactsList");
  }
}
