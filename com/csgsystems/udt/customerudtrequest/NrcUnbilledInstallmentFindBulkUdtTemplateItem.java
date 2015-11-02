/*
 * Generated code DO NOT EDIT
 * Generated file: NrcUnbilledInstallmentFindBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a NrcUnbilledInstallmentFindBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcUnbilledInstallmentFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Date disconnect_date;
  protected Integer account_no;
  protected Integer subscr_no;
  protected Integer subscr_no_resets;
/**
 *
 * Constructor to create a  NrcUnbilledInstallmentFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcUnbilledInstallmentFindBulkUdtTemplateItem(String id, BSDMSessionContext context, Date disconnect_dateIn, Integer account_noIn, Integer subscr_noIn, Integer subscr_no_resetsIn) {
    super(id, context, "NrcUnbilledInstallmentFind");
    disconnect_date = disconnect_dateIn;
    account_no = account_noIn;
    subscr_no = subscr_noIn;
    subscr_no_resets = subscr_no_resetsIn;
  }

  public void translateToMap() {
    if (disconnect_date != null) {
      addInput("DisconnectDate", disconnect_date);
    }
    if (account_no != null) {
      addInput("AccountInternalId", account_no);
    }
    if (subscr_no != null) {
      addInput("ServiceInternalId", subscr_no);
    }
    if (subscr_no_resets != null) {
      addInput("ServiceInternalIdResets", subscr_no_resets);
    }
  }


/**
 *
 * Sets the DisconnectDate
 * @param disconnect_dateIn Value of the disconnect_date
 *
 */

  public void setDisconnectDate(Date disconnect_dateIn) {
    disconnect_date = disconnect_dateIn;
  }

/**
 *
 * Sets the AccountInternalId
 * @param account_noIn Value of the account_no
 *
 */

  public void setAccountInternalId(Integer account_noIn) {
    account_no = account_noIn;
  }

/**
 *
 * Sets the ServiceInternalId
 * @param subscr_noIn Value of the subscr_no
 *
 */

  public void setServiceInternalId(Integer subscr_noIn) {
    subscr_no = subscr_noIn;
  }

/**
 *
 * Sets the ServiceInternalIdResets
 * @param subscr_no_resetsIn Value of the subscr_no_resets
 *
 */

  public void setServiceInternalIdResets(Integer subscr_no_resetsIn) {
    subscr_no_resets = subscr_no_resetsIn;
  }

  public void translateFromMap() {
    disconnect_date = (Date)inputMap.get("DisconnectDate");
    account_no = (Integer)inputMap.get("AccountInternalId");
    subscr_no = (Integer)inputMap.get("ServiceInternalId");
    subscr_no_resets = (Integer)inputMap.get("ServiceInternalIdResets");
  }

/**
 *
 * Gets the DisconnectDate
 * @return Value of the DisconnectDate
 *
 */

  public Date getDisconnectDate( ) {
    return disconnect_date;
  }

/**
 *
 * Gets the AccountInternalId
 * @return Value of the AccountInternalId
 *
 */

  public Integer getAccountInternalId( ) {
    return account_no;
  }

/**
 *
 * Gets the ServiceInternalId
 * @return Value of the ServiceInternalId
 *
 */

  public Integer getServiceInternalId( ) {
    return subscr_no;
  }

/**
 *
 * Gets the ServiceInternalIdResets
 * @return Value of the ServiceInternalIdResets
 *
 */

  public Integer getServiceInternalIdResets( ) {
    return subscr_no_resets;
  }

}
