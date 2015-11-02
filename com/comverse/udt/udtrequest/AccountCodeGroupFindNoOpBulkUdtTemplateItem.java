/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCodeGroupFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountCodeGroupFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountCodeGroupFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountCodeGroupObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AccountCodeGroupFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountCodeGroupFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountCodeGroupObjectDataList noOpInIn) {
    super(id, context, "AccountCodeGroupFind");
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
        mapArray[i] = AccountCodeGroupObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountCodeGroup", noOpIn);
      }
      addInput("AccountCodeGroup", mapList);
    }
  }
/**
 *
 * Sets the  AccountCodeGroup
 * @param noOpInIn AccountCodeGroupObjectDataList to set
 *
 */
  public void setAccountCodeGroup(AccountCodeGroupObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountCodeGroup passed into the constructor
 * @return Simulated response
 *
 */
  public AccountCodeGroupObjectDataList getAccountCodeGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountCodeGroupObjectHelper.fromMapList(inputMap, "AccountCodeGroupList");
  }
}
