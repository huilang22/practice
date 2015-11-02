/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoicePostpaidProductChargeTotalBulkUdtTemplateItem.java
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
 * Class used to create a InvoicePostpaidProductChargeTotalBulkUdtTemplateItem Bulk Template
 *
 */

public class InvoicePostpaidProductChargeTotalBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer bill_ref_no;
  protected Integer bill_ref_resets;
/**
 *
 * Constructor to create a  InvoicePostpaidProductChargeTotalBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvoicePostpaidProductChargeTotalBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer bill_ref_noIn, Integer bill_ref_resetsIn) {
    super(id, context, "InvoicePostpaidProductChargeTotal");
    bill_ref_no = bill_ref_noIn;
    bill_ref_resets = bill_ref_resetsIn;
  }

  public void translateToMap() {
    if (bill_ref_no != null) {
      addInput("BillRefNo", bill_ref_no);
    }
    if (bill_ref_resets != null) {
      addInput("BillRefResets", bill_ref_resets);
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

  public void translateFromMap() {
    bill_ref_no = (Integer)inputMap.get("BillRefNo");
    bill_ref_resets = (Integer)inputMap.get("BillRefResets");
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

}
