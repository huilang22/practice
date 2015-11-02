/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountDisconnectChargeAmountGetBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a AccountDisconnectChargeAmountGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountDisconnectChargeAmountGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer AccountInternal_id;
  protected Date EffectiveDate;
/**
 *
 * Constructor to create a  AccountDisconnectChargeAmountGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountDisconnectChargeAmountGetBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer AccountInternal_idIn, Date EffectiveDateIn) {
    super(id, context, "AccountDisconnectChargeAmountGet");
    AccountInternal_id = AccountInternal_idIn;
    EffectiveDate = EffectiveDateIn;
  }

  public void translateToMap() {
    if (AccountInternal_id != null) {
      addInput("AccountInternalId", AccountInternal_id);
    }
    if (EffectiveDate != null) {
      addInput("EffectiveDate", EffectiveDate);
    }
  }


/**
 *
 * Sets the AccountInternalId
 * @param AccountInternal_idIn Value of the AccountInternal_id
 *
 */

  public void setAccountInternalId(Integer AccountInternal_idIn) {
    AccountInternal_id = AccountInternal_idIn;
  }

/**
 *
 * Sets the EffectiveDate
 * @param EffectiveDateIn Value of the EffectiveDate
 *
 */

  public void setEffectiveDate(Date EffectiveDateIn) {
    EffectiveDate = EffectiveDateIn;
  }

  public void translateFromMap() {
    AccountInternal_id = (Integer)inputMap.get("AccountInternalId");
    EffectiveDate = (Date)inputMap.get("EffectiveDate");
  }

/**
 *
 * Gets the AccountInternalId
 * @return Value of the AccountInternalId
 *
 */

  public Integer getAccountInternalId( ) {
    return AccountInternal_id;
  }

/**
 *
 * Gets the EffectiveDate
 * @return Value of the EffectiveDate
 *
 */

  public Date getEffectiveDate( ) {
    return EffectiveDate;
  }

}
