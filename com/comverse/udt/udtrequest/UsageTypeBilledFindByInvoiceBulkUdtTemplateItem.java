/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeBilledFindByInvoiceBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a UsageTypeBilledFindByInvoiceBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageTypeBilledFindByInvoiceBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer language_code;
  protected Integer bill_ref_no;
  protected Integer bill_ref_resets;
/**
 *
 * Constructor to create a  UsageTypeBilledFindByInvoiceBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageTypeBilledFindByInvoiceBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer language_codeIn, Integer bill_ref_noIn, Integer bill_ref_resetsIn) {
    super(id, context, "UsageTypeBilledFindByInvoice");
    language_code = language_codeIn;
    bill_ref_no = bill_ref_noIn;
    bill_ref_resets = bill_ref_resetsIn;
  }

  public void translateToMap() {
    if (language_code != null) {
      addInput("LanguageCode", language_code);
    }
    if (bill_ref_no != null) {
      addInput("BillRefNo", bill_ref_no);
    }
    if (bill_ref_resets != null) {
      addInput("BillRefResets", bill_ref_resets);
    }
  }


/**
 *
 * Sets the LanguageCode
 * @param language_codeIn Value of the language_code
 *
 */

  public void setLanguageCode(Integer language_codeIn) {
    language_code = language_codeIn;
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
    language_code = (Integer)inputMap.get("LanguageCode");
    bill_ref_no = (Integer)inputMap.get("BillRefNo");
    bill_ref_resets = (Integer)inputMap.get("BillRefResets");
  }

/**
 *
 * Gets the LanguageCode
 * @return Value of the LanguageCode
 *
 */

  public Integer getLanguageCode( ) {
    return language_code;
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
