/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCodeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountCodeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountCodeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountCodeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AccountCodeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountCodeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountCodeObjectDataList noOpInIn) {
    super(id, context, "AccountCodeFind");
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
        mapArray[i] = AccountCodeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountCode", noOpIn);
      }
      addInput("AccountCode", mapList);
    }
  }
/**
 *
 * Sets the  AccountCode
 * @param noOpInIn AccountCodeObjectDataList to set
 *
 */
  public void setAccountCode(AccountCodeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountCode passed into the constructor
 * @return Simulated response
 *
 */
  public AccountCodeObjectDataList getAccountCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountCodeObjectHelper.fromMapList(inputMap, "AccountCodeList");
  }
}
