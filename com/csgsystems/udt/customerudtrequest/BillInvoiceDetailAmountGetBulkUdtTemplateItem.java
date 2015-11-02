/*
 * Generated code DO NOT EDIT
 * Generated file: BillInvoiceDetailAmountGetBulkUdtTemplateItem.java
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

/**
 *
 * Class used to create a BillInvoiceDetailAmountGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BillInvoiceDetailAmountGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer bill_ref_no;
  protected Integer bill_ref_resets;
  protected Integer open_item_id;
/**
 *
 * Constructor to create a  BillInvoiceDetailAmountGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillInvoiceDetailAmountGetBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer bill_ref_noIn, Integer bill_ref_resetsIn, Integer open_item_idIn) {
    super(id, context, "BillInvoiceDetailAmountGet");
    bill_ref_no = bill_ref_noIn;
    bill_ref_resets = bill_ref_resetsIn;
    open_item_id = open_item_idIn;
  }

  public void translateToMap() {
    if (bill_ref_no != null) {
      addInput("BillRefNo", bill_ref_no);
    }
    if (bill_ref_resets != null) {
      addInput("BillRefResets", bill_ref_resets);
    }
    if (open_item_id != null) {
      addInput("OpenItemId", open_item_id);
    }
  }


/**
 *
 * Sets the BillRefNo
 * @param bill_ref_noIn Value of the bill_ref_no
 *
 */

  public void setBillRefNo(Integer bill_ref_noIn) {
    bill_ref_no = bill_ref_noIn;
  }

/**
 *
 * Sets the BillRefResets
 * @param bill_ref_resetsIn Value of the bill_ref_resets
 *
 */

  public void setBillRefResets(Integer bill_ref_resetsIn) {
    bill_ref_resets = bill_ref_resetsIn;
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

  public void translateFromMap() {
    bill_ref_no = (Integer)inputMap.get("BillRefNo");
    bill_ref_resets = (Integer)inputMap.get("BillRefResets");
    open_item_id = (Integer)inputMap.get("OpenItemId");
  }

/**
 *
 * Gets the BillRefNo
 * @return Value of the BillRefNo
 *
 */

  public Integer getBillRefNo( ) {
    return bill_ref_no;
  }

/**
 *
 * Gets the BillRefResets
 * @return Value of the BillRefResets
 *
 */

  public Integer getBillRefResets( ) {
    return bill_ref_resets;
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

}
