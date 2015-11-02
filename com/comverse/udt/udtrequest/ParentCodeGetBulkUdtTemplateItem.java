/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ParentCodeGetBulkUdtTemplateItem.java
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
 * Class used to create a ParentCodeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ParentCodeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ParentCodeObjectKeyData ParentCodeGetIn;
/**
 *
 * Constructor to create a  ParentCodeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ParentCodeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ParentCodeObjectKeyData ParentCodeGetInIn) {
    super(id, context, "ParentCodeGet");
    ParentCodeGetIn = ParentCodeGetInIn;
  }

  public void translateToMap() {
    if (ParentCodeGetIn != null) {
      ParentCodeGetIn.resetFlags(true, true);
      addInput("ParentCode", ParentCodeObjectKeyHelper.toMap(ParentCodeGetIn, new HashMap(), "ParentCodeObjectKeyData").get("ParentCodeObjectKeyData"));
    }
  }


/**
 *
 * Sets the ParentCode
 * @param ParentCodeGetInIn Value of the ParentCodeGetIn
 *
 */

  public void setParentCode(ParentCodeObjectKeyData ParentCodeGetInIn) {
    ParentCodeGetIn = ParentCodeGetInIn;
  }

  public void translateFromMap() {
    ParentCodeGetIn = ParentCodeObjectKeyHelper.fromMap(inputMap, "ParentCode");
  }

/**
 *
 * Gets the ParentCode
 * @return Value of the ParentCode
 *
 */

  public ParentCodeObjectKeyData getParentCode( ) {
    return ParentCodeGetIn;
  }

}
