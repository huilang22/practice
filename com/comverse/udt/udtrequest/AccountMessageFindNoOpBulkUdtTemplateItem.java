/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountMessageFindNoOpBulkUdtTemplateItem.java
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

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a AccountMessageFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountMessageFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountMessageObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AccountMessageFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountMessageFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountMessageObjectDataList noOpInIn) {
    super(id, context, "AccountMessageFind");
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
        mapArray[i] = AccountMessageObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountMessage", noOpIn);
      }
      addInput("AccountMessage", mapList);
    }
  }
/**
 *
 * Sets the  AccountMessage
 * @param noOpInIn AccountMessageObjectDataList to set
 *
 */
  public void setAccountMessage(AccountMessageObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountMessage passed into the constructor
 * @return Simulated response
 *
 */
  public AccountMessageObjectDataList getAccountMessage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountMessageObjectHelper.fromMapList(inputMap, "AccountMessageList");
  }
}
