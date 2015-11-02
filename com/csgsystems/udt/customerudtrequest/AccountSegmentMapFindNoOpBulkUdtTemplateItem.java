/*
 * Generated code DO NOT EDIT
 * Generated file: AccountSegmentMapFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountSegmentMapFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountSegmentMapFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountSegmentMapObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AccountSegmentMapFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountSegmentMapFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountSegmentMapObjectDataList noOpInIn) {
    super(id, context, "AccountSegmentMapFind");
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
        mapArray[i] = AccountSegmentMapObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountSegmentMap", noOpIn);
      }
      addInput("AccountSegmentMap", mapList);
    }
  }
/**
 *
 * Sets the  AccountSegmentMap
 * @param noOpInIn AccountSegmentMapObjectDataList to set
 *
 */
  public void setAccountSegmentMap(AccountSegmentMapObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountSegmentMap passed into the constructor
 * @return Simulated response
 *
 */
  public AccountSegmentMapObjectDataList getAccountSegmentMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountSegmentMapObjectHelper.fromMapList(inputMap, "AccountSegmentMapList");
  }
}
