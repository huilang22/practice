/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcGroupGetBulkUdtTemplateItem.java
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
 * Class used to create a NrcGroupGetBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcGroupGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcGroupObjectKeyData ngGetIn;
/**
 *
 * Constructor to create a  NrcGroupGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcGroupGetBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcGroupObjectKeyData ngGetInIn) {
    super(id, context, "NrcGroupGet");
    ngGetIn = ngGetInIn;
  }

  public void translateToMap() {
    if (ngGetIn != null) {
      ngGetIn.resetFlags(true, true);
      addInput("NrcGroup", NrcGroupObjectKeyHelper.toMap(ngGetIn, new HashMap(), "NrcGroupObjectKeyData").get("NrcGroupObjectKeyData"));
    }
  }


/**
 *
 * Sets the NrcGroup
 * @param ngGetInIn Value of the ngGetIn
 *
 */

  public void setNrcGroup(NrcGroupObjectKeyData ngGetInIn) {
    ngGetIn = ngGetInIn;
  }

  public void translateFromMap() {
    ngGetIn = NrcGroupObjectKeyHelper.fromMap(inputMap, "NrcGroup");
  }

/**
 *
 * Gets the NrcGroup
 * @return Value of the NrcGroup
 *
 */

  public NrcGroupObjectKeyData getNrcGroup( ) {
    return ngGetIn;
  }

}
