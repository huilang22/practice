/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoicePrepaidProductChargeTotalBulkUdtTemplateItem.java
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
 * Class used to create a InvoicePrepaidProductChargeTotalBulkUdtTemplateItem Bulk Template
 *
 */

public class InvoicePrepaidProductChargeTotalBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer Bill_ref_no;
  protected Integer Bill_ref_resets;
/**
 *
 * Constructor to create a  InvoicePrepaidProductChargeTotalBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvoicePrepaidProductChargeTotalBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer Bill_ref_noIn, Integer Bill_ref_resetsIn) {
    super(id, context, "InvoicePrepaidProductChargeTotal");
    Bill_ref_no = Bill_ref_noIn;
    Bill_ref_resets = Bill_ref_resetsIn;
  }

  public void translateToMap() {
    if (Bill_ref_no != null) {
      addInput("BillRefNo", Bill_ref_no);
    }
    if (Bill_ref_resets != null) {
      addInput("BillRefResets", Bill_ref_resets);
    }
  }


/**
 *
 * Sets the BillRefNo
 * @param Bill_ref_noIn Value of the Bill_ref_no
 *
 */

  public void setBillRefNo(Integer Bill_ref_noIn) {
    Bill_ref_no = Bill_ref_noIn;
  }

/**
 *
 * Sets the BillRefResets
 * @param Bill_ref_resetsIn Value of the Bill_ref_resets
 *
 */

  public void setBillRefResets(Integer Bill_ref_resetsIn) {
    Bill_ref_resets = Bill_ref_resetsIn;
  }

  public void translateFromMap() {
    Bill_ref_no = (Integer)inputMap.get("BillRefNo");
    Bill_ref_resets = (Integer)inputMap.get("BillRefResets");
  }

/**
 *
 * Gets the BillRefNo
 * @return Value of the BillRefNo
 *
 */

  public Integer getBillRefNo( ) {
    return Bill_ref_no;
  }

/**
 *
 * Gets the BillRefResets
 * @return Value of the BillRefResets
 *
 */

  public Integer getBillRefResets( ) {
    return Bill_ref_resets;
  }

}
