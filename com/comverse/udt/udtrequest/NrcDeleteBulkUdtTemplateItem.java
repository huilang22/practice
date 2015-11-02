/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcDeleteBulkUdtTemplateItem.java
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
 * Class used to create a NrcDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcObjectBaseKeyData NrcDeleteIn;
/**
 *
 * Constructor to create a  NrcDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcObjectBaseKeyData NrcDeleteInIn) {
    super(id, context, "NrcDelete");
    NrcDeleteIn = NrcDeleteInIn;
  }

  public void translateToMap() {
    if (NrcDeleteIn != null) {
      NrcDeleteIn.resetFlags(true, true);
      addInput("Nrc", NrcObjectBaseKeyHelper.toMap(NrcDeleteIn, new HashMap(), "NrcObjectBaseKeyData").get("NrcObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the Nrc
 * @param NrcDeleteInIn Value of the NrcDeleteIn
 *
 */

  public void setNrc(NrcObjectBaseKeyData NrcDeleteInIn) {
    NrcDeleteIn = NrcDeleteInIn;
  }

  public void translateFromMap() {
    NrcDeleteIn = NrcObjectBaseKeyHelper.fromMap(inputMap, "Nrc");
  }

/**
 *
 * Gets the Nrc
 * @return Value of the Nrc
 *
 */

  public NrcObjectBaseKeyData getNrc( ) {
    return NrcDeleteIn;
  }

}
