/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdrAddressFindByAccountBulkUdtTemplateItem.java
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
 * Class used to create a AdrAddressFindByAccountBulkUdtTemplateItem Bulk Template
 *
 */

public class AdrAddressFindByAccountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer account_internal_id;
/**
 *
 * Constructor to create a  AdrAddressFindByAccountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdrAddressFindByAccountBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer account_internal_idIn) {
    super(id, context, "AdrAddressFindByAccount");
    account_internal_id = account_internal_idIn;
  }

  public void translateToMap() {
    if (account_internal_id != null) {
      addInput("AccountInternalId", account_internal_id);
    }
  }


/**
 *
 * Sets the AccountInternalId
 * @param account_internal_idIn Value of the account_internal_id
 *
 */

  public void setAccountInternalId(Integer account_internal_idIn) {
    account_internal_id = account_internal_idIn;
  }

  public void translateFromMap() {
    account_internal_id = (Integer)inputMap.get("AccountInternalId");
  }

/**
 *
 * Gets the AccountInternalId
 * @return Value of the AccountInternalId
 *
 */

  public Integer getAccountInternalId( ) {
    return account_internal_id;
  }

}
