/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointBalanceFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountBonusPointBalanceFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountBonusPointBalanceFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountBonusPointBalanceObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AccountBonusPointBalanceFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountBonusPointBalanceFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountBonusPointBalanceObjectDataList noOpInIn) {
    super(id, context, "AccountBonusPointBalanceFind");
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
        mapArray[i] = AccountBonusPointBalanceObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountBonusPointBalance", noOpIn);
      }
      addInput("AccountBonusPointBalance", mapList);
    }
  }
/**
 *
 * Sets the  AccountBonusPointBalance
 * @param noOpInIn AccountBonusPointBalanceObjectDataList to set
 *
 */
  public void setAccountBonusPointBalance(AccountBonusPointBalanceObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountBonusPointBalance passed into the constructor
 * @return Simulated response
 *
 */
  public AccountBonusPointBalanceObjectDataList getAccountBonusPointBalance() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountBonusPointBalanceObjectHelper.fromMapList(inputMap, "AccountBonusPointBalanceList");
  }
}
