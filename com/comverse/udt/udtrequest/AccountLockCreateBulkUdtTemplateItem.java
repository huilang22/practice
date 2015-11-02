/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountLockCreateBulkUdtTemplateItem.java
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
 * Class used to create a AccountLockCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountLockCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer AccountInternalId;
  protected String ServiceOrderId;
/**
 *
 * Constructor to create a  AccountLockCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountLockCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer AccountInternalIdIn, String ServiceOrderIdIn) {
    super(id, context, "AccountLockCreate");
    AccountInternalId = AccountInternalIdIn;
    ServiceOrderId = ServiceOrderIdIn;
  }

  public void translateToMap() {
    if (AccountInternalId != null) {
      addInput("AccountInternalId", AccountInternalId);
    }
    if (ServiceOrderId != null) {
      addInput("ServiceOrderId", ServiceOrderId);
    }
  }


/**
 *
 * Sets the AccountInternalId
 * @param AccountInternalIdIn Value of the AccountInternalId
 *
 */

  public void setAccountInternalId(Integer AccountInternalIdIn) {
    AccountInternalId = AccountInternalIdIn;
  }

/**
 *
 * Sets the ServiceOrderId
 * @param ServiceOrderIdIn Value of the ServiceOrderId
 *
 */

  public void setServiceOrderId(String ServiceOrderIdIn) {
    ServiceOrderId = ServiceOrderIdIn;
  }

  public void translateFromMap() {
    AccountInternalId = (Integer)inputMap.get("AccountInternalId");
    ServiceOrderId = (String)inputMap.get("ServiceOrderId");
  }

/**
 *
 * Gets the AccountInternalId
 * @return Value of the AccountInternalId
 *
 */

  public Integer getAccountInternalId( ) {
    return AccountInternalId;
  }

/**
 *
 * Gets the ServiceOrderId
 * @return Value of the ServiceOrderId
 *
 */

  public String getServiceOrderId( ) {
    return ServiceOrderId;
  }

}
