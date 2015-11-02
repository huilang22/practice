/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcLineGetBulkUdtTemplateItem.java
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
 * Class used to create a NrcLineGetBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcLineGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcLineObjectKeyData nlGetIn;
/**
 *
 * Constructor to create a  NrcLineGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcLineGetBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcLineObjectKeyData nlGetInIn) {
    super(id, context, "NrcLineGet");
    nlGetIn = nlGetInIn;
  }

  public void translateToMap() {
    if (nlGetIn != null) {
      nlGetIn.resetFlags(true, true);
      addInput("NrcLine", NrcLineObjectKeyHelper.toMap(nlGetIn, new HashMap(), "NrcLineObjectKeyData").get("NrcLineObjectKeyData"));
    }
  }


/**
 *
 * Sets the NrcLine
 * @param nlGetInIn Value of the nlGetIn
 *
 */

  public void setNrcLine(NrcLineObjectKeyData nlGetInIn) {
    nlGetIn = nlGetInIn;
  }

  public void translateFromMap() {
    nlGetIn = NrcLineObjectKeyHelper.fromMap(inputMap, "NrcLine");
  }

/**
 *
 * Gets the NrcLine
 * @return Value of the NrcLine
 *
 */

  public NrcLineObjectKeyData getNrcLine( ) {
    return nlGetIn;
  }

}
