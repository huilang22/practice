/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountLocateFindByOrderNumberNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountLocateFindByOrderNumberNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountLocateFindByOrderNumberNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountLocateXIDObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AccountLocateFindByOrderNumberNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountLocateFindByOrderNumberNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountLocateXIDObjectDataList noOpInIn) {
    super(id, context, "AccountLocateFindByOrderNumber");
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
        mapArray[i] = AccountLocateXIDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountLocate", noOpIn);
      }
      addInput("AccountLocate", mapList);
    }
  }
/**
 *
 * Sets the  AccountLocate
 * @param noOpInIn AccountLocateXIDObjectDataList to set
 *
 */
  public void setAccountLocate(AccountLocateXIDObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountLocate passed into the constructor
 * @return Simulated response
 *
 */
  public AccountLocateXIDObjectDataList getAccountLocate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountLocateXIDObjectHelper.fromMapList(inputMap, "AccountLocateList");
  }
}
