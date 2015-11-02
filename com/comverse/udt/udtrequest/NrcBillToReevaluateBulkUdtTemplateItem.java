/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcBillToReevaluateBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a NrcBillToReevaluateBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcBillToReevaluateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcObjectBaseKeyData NrcReIn;
  protected Integer billing_account_internal_id;
  protected Integer open_item_id;
  protected Date reevaluation_date;
/**
 *
 * Constructor to create a  NrcBillToReevaluateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcBillToReevaluateBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcObjectBaseKeyData NrcReInIn, Integer billing_account_internal_idIn, Integer open_item_idIn, Date reevaluation_dateIn) {
    super(id, context, "NrcBillToReevaluate");
    NrcReIn = NrcReInIn;
    billing_account_internal_id = billing_account_internal_idIn;
    open_item_id = open_item_idIn;
    reevaluation_date = reevaluation_dateIn;
  }

  public void translateToMap() {
    if (NrcReIn != null) {
      NrcReIn.resetFlags(true, true);
      addInput("Nrc", NrcObjectBaseKeyHelper.toMap(NrcReIn, new HashMap(), "NrcObjectBaseKeyData").get("NrcObjectBaseKeyData"));
    }
    if (billing_account_internal_id != null) {
      addInput("BillingAccountInternalId", billing_account_internal_id);
    }
    if (open_item_id != null) {
      addInput("OpenItemId", open_item_id);
    }
    if (reevaluation_date != null) {
      addInput("ReevaluationDate", reevaluation_date);
    }
  }


/**
 *
 * Sets the Nrc
 * @param NrcReInIn Value of the NrcReIn
 *
 */

  public void setNrc(NrcObjectBaseKeyData NrcReInIn) {
    NrcReIn = NrcReInIn;
  }

/**
 *
 * Sets the BillingAccountInternalId
 * @param billing_account_internal_idIn Value of the billing_account_internal_id
 *
 */

  public void setBillingAccountInternalId(Integer billing_account_internal_idIn) {
    billing_account_internal_id = billing_account_internal_idIn;
  }

/**
 *
 * Sets the OpenItemId
 * @param open_item_idIn Value of the open_item_id
 *
 */

  public void setOpenItemId(Integer open_item_idIn) {
    open_item_id = open_item_idIn;
  }

/**
 *
 * Sets the ReevaluationDate
 * @param reevaluation_dateIn Value of the reevaluation_date
 *
 */

  public void setReevaluationDate(Date reevaluation_dateIn) {
    reevaluation_date = reevaluation_dateIn;
  }

  public void translateFromMap() {
    NrcReIn = NrcObjectBaseKeyHelper.fromMap(inputMap, "Nrc");
    billing_account_internal_id = (Integer)inputMap.get("BillingAccountInternalId");
    open_item_id = (Integer)inputMap.get("OpenItemId");
    reevaluation_date = (Date)inputMap.get("ReevaluationDate");
  }

/**
 *
 * Gets the Nrc
 * @return Value of the Nrc
 *
 */

  public NrcObjectBaseKeyData getNrc( ) {
    return NrcReIn;
  }

/**
 *
 * Gets the BillingAccountInternalId
 * @return Value of the BillingAccountInternalId
 *
 */

  public Integer getBillingAccountInternalId( ) {
    return billing_account_internal_id;
  }

/**
 *
 * Gets the OpenItemId
 * @return Value of the OpenItemId
 *
 */

  public Integer getOpenItemId( ) {
    return open_item_id;
  }

/**
 *
 * Gets the ReevaluationDate
 * @return Value of the ReevaluationDate
 *
 */

  public Date getReevaluationDate( ) {
    return reevaluation_date;
  }

}
