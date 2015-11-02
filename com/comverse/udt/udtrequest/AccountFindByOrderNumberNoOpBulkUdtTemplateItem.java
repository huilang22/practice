/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountFindByOrderNumberNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountFindByOrderNumberNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountFindByOrderNumberNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountXIDObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AccountFindByOrderNumberNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountFindByOrderNumberNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountXIDObjectDataList noOpInIn) {
    super(id, context, "AccountFindByOrderNumber");
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
        mapArray[i] = AccountXIDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Account", noOpIn);
      }
      addInput("Account", mapList);
    }
  }
/**
 *
 * Sets the  Account
 * @param noOpInIn AccountXIDObjectDataList to set
 *
 */
  public void setAccount(AccountXIDObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Account passed into the constructor
 * @return Simulated response
 *
 */
  public AccountXIDObjectDataList getAccount() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountXIDObjectHelper.fromMapList(inputMap, "AccountList");
  }
}
