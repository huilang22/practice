/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CreditCardCreateBulkUdtTemplateItem.java
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
 * Class used to create a CreditCardCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CreditCardCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CreditCardObjectData createIn;
/**
 *
 * Constructor to create a  CreditCardCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CreditCardCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CreditCardObjectData createInIn) {
    super(id, context, "CreditCardCreate");
    createIn = createInIn;
  }

  public void translateToMap() {
    if (createIn != null) {
      createIn.resetFlags(true, true);
      addInput("CreditCard", CreditCardObjectHelper.toMap(createIn, new HashMap(), "CreditCard").get("CreditCard"));
    }
  }


/**
 *
 * Sets the CreditCard
 * @param createInIn Value of the createIn
 *
 */

  public void setCreditCard(CreditCardObjectData createInIn) {
    createIn = createInIn;
  }

  public void translateFromMap() {
    createIn = CreditCardObjectHelper.fromMap(inputMap, "CreditCard");
  }

/**
 *
 * Gets the CreditCard
 * @return Value of the CreditCard
 *
 */

  public CreditCardObjectData getCreditCard( ) {
    return createIn;
  }

}
