/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountHqContractFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountHqContractFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountHqContractFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountHqContractObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AccountHqContractFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountHqContractFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountHqContractObjectDataList noOpInIn) {
    super(id, context, "AccountHqContractFind");
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
        mapArray[i] = AccountHqContractObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountHqContract", noOpIn);
      }
      addInput("AccountHqContract", mapList);
    }
  }
/**
 *
 * Sets the  AccountHqContract
 * @param noOpInIn AccountHqContractObjectDataList to set
 *
 */
  public void setAccountHqContract(AccountHqContractObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountHqContract passed into the constructor
 * @return Simulated response
 *
 */
  public AccountHqContractObjectDataList getAccountHqContract() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountHqContractObjectHelper.fromMapList(inputMap, "AccountHqContractList");
  }
}
