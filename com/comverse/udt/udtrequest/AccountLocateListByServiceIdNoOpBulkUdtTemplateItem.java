/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountLocateListByServiceIdNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountLocateListByServiceIdNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountLocateListByServiceIdNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountLocateXIDObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AccountLocateListByServiceIdNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountLocateListByServiceIdNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountLocateXIDObjectDataList noOpInIn) {
    super(id, context, "AccountLocateListByServiceId");
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
