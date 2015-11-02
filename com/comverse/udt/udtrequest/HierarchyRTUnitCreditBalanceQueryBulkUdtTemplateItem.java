/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HierarchyRTUnitCreditBalanceQueryBulkUdtTemplateItem.java
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
 * Class used to create a HierarchyRTUnitCreditBalanceQueryBulkUdtTemplateItem Bulk Template
 *
 */

public class HierarchyRTUnitCreditBalanceQueryBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer account_internal_id;
  protected Integer Granularity;
/**
 *
 * Constructor to create a  HierarchyRTUnitCreditBalanceQueryBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HierarchyRTUnitCreditBalanceQueryBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer account_internal_idIn, Integer GranularityIn) {
    super(id, context, "HierarchyRTUnitCreditBalanceQuery");
    account_internal_id = account_internal_idIn;
    Granularity = GranularityIn;
  }

  public void translateToMap() {
    if (account_internal_id != null) {
      addInput("AccountInternalId", account_internal_id);
    }
    if (Granularity != null) {
      addInput("Granularity", Granularity);
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

/**
 *
 * Sets the Granularity
 * @param GranularityIn Value of the Granularity
 *
 */

  public void setGranularity(Integer GranularityIn) {
    Granularity = GranularityIn;
  }

  public void translateFromMap() {
    account_internal_id = (Integer)inputMap.get("AccountInternalId");
    Granularity = (Integer)inputMap.get("Granularity");
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

/**
 *
 * Gets the Granularity
 * @return Value of the Granularity
 *
 */

  public Integer getGranularity( ) {
    return Granularity;
  }

}
