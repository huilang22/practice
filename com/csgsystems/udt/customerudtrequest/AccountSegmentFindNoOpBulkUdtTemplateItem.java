/*
 * Generated code DO NOT EDIT
 * Generated file: AccountSegmentFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountSegmentFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountSegmentFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountSegmentObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AccountSegmentFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountSegmentFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountSegmentObjectDataList noOpInIn) {
    super(id, context, "AccountSegmentFind");
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
        mapArray[i] = AccountSegmentObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountSegment", noOpIn);
      }
      addInput("AccountSegment", mapList);
    }
  }
/**
 *
 * Sets the  AccountSegment
 * @param noOpInIn AccountSegmentObjectDataList to set
 *
 */
  public void setAccountSegment(AccountSegmentObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountSegment passed into the constructor
 * @return Simulated response
 *
 */
  public AccountSegmentObjectDataList getAccountSegment() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountSegmentObjectHelper.fromMapList(inputMap, "AccountSegmentList");
  }
}
