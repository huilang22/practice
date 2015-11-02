/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CreditCardTypeCodeFindBulkUdtTemplateItem.java
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
 * Class used to create a CreditCardTypeCodeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CreditCardTypeCodeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CreditCardTypeCodeObjectFilter CreditCardTypeCodefindIn;
/**
 *
 * Constructor to create a  CreditCardTypeCodeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CreditCardTypeCodeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CreditCardTypeCodeObjectFilter CreditCardTypeCodefindInIn) {
    super(id, context, "CreditCardTypeCodeFind");
    CreditCardTypeCodefindIn = CreditCardTypeCodefindInIn;
  }

  public void translateToMap() {
    if (CreditCardTypeCodefindIn != null) {
      Integer index =  CreditCardTypeCodefindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CreditCardTypeCode", CreditCardTypeCodeObjectHelper.toMap(CreditCardTypeCodefindIn, new HashMap(), "CreditCardTypeCode").get("CreditCardTypeCode"));
    }
  }


/**
 *
 * Sets the CreditCardTypeCode
 * @param CreditCardTypeCodefindInIn Value of the CreditCardTypeCodefindIn
 *
 */

  public void setCreditCardTypeCode(CreditCardTypeCodeObjectFilter CreditCardTypeCodefindInIn) {
    CreditCardTypeCodefindIn = CreditCardTypeCodefindInIn;
  }

  public void translateFromMap() {
    CreditCardTypeCodefindIn = CreditCardTypeCodeObjectHelper.fromMapFilter(inputMap, "CreditCardTypeCode");
  }

/**
 *
 * Gets the CreditCardTypeCode
 * @return Value of the CreditCardTypeCode
 *
 */

  public CreditCardTypeCodeObjectFilter getCreditCardTypeCode( ) {
    return CreditCardTypeCodefindIn;
  }

}
