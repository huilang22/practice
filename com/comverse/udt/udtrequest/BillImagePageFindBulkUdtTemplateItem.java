/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillImagePageFindBulkUdtTemplateItem.java
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
 * Class used to create a BillImagePageFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BillImagePageFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillImagePageObjectFilter BillImagePageFindIn;
  protected Date account_active_date;
/**
 *
 * Constructor to create a  BillImagePageFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillImagePageFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BillImagePageObjectFilter BillImagePageFindInIn, Date account_active_dateIn) {
    super(id, context, "BillImagePageFind");
    BillImagePageFindIn = BillImagePageFindInIn;
    account_active_date = account_active_dateIn;
  }

  public void translateToMap() {
    if (BillImagePageFindIn != null) {
      Integer index =  BillImagePageFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BillImagePage", BillImagePageObjectHelper.toMap(BillImagePageFindIn, new HashMap(), "BillImagePage").get("BillImagePage"));
    }
    if (account_active_date != null) {
      addInput("AccountActiveDate", account_active_date);
    }
  }


/**
 *
 * Sets the BillImagePage
 * @param BillImagePageFindInIn Value of the BillImagePageFindIn
 *
 */

  public void setBillImagePage(BillImagePageObjectFilter BillImagePageFindInIn) {
    BillImagePageFindIn = BillImagePageFindInIn;
  }

/**
 *
 * Sets the AccountActiveDate
 * @param account_active_dateIn Value of the account_active_date
 *
 */

  public void setAccountActiveDate(Date account_active_dateIn) {
    account_active_date = account_active_dateIn;
  }

  public void translateFromMap() {
    BillImagePageFindIn = BillImagePageObjectHelper.fromMapFilter(inputMap, "BillImagePage");
    account_active_date = (Date)inputMap.get("AccountActiveDate");
  }

/**
 *
 * Gets the BillImagePage
 * @return Value of the BillImagePage
 *
 */

  public BillImagePageObjectFilter getBillImagePage( ) {
    return BillImagePageFindIn;
  }

/**
 *
 * Gets the AccountActiveDate
 * @return Value of the AccountActiveDate
 *
 */

  public Date getAccountActiveDate( ) {
    return account_active_date;
  }

}
