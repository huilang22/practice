/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcGetBulkUdtTemplateItem.java
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
 * Class used to create a NrcGetBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcObjectBaseKeyData NrcGetIn;
/**
 *
 * Constructor to create a  NrcGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcGetBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcObjectBaseKeyData NrcGetInIn) {
    super(id, context, "NrcGet");
    NrcGetIn = NrcGetInIn;
  }

  public void translateToMap() {
    if (NrcGetIn != null) {
      NrcGetIn.resetFlags(true, true);
      addInput("Nrc", NrcObjectBaseKeyHelper.toMap(NrcGetIn, new HashMap(), "NrcObjectBaseKeyData").get("NrcObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the Nrc
 * @param NrcGetInIn Value of the NrcGetIn
 *
 */

  public void setNrc(NrcObjectBaseKeyData NrcGetInIn) {
    NrcGetIn = NrcGetInIn;
  }

  public void translateFromMap() {
    NrcGetIn = NrcObjectBaseKeyHelper.fromMap(inputMap, "Nrc");
  }

/**
 *
 * Gets the Nrc
 * @return Value of the Nrc
 *
 */

  public NrcObjectBaseKeyData getNrc( ) {
    return NrcGetIn;
  }

}
