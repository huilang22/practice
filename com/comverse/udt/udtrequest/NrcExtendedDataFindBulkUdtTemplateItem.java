/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcExtendedDataFindBulkUdtTemplateItem.java
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
 * Class used to create a NrcExtendedDataFindBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcExtendedDataFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcObjectBaseKeyData nedfIn;
/**
 *
 * Constructor to create a  NrcExtendedDataFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcExtendedDataFindBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcObjectBaseKeyData nedfInIn) {
    super(id, context, "NrcExtendedDataFind");
    nedfIn = nedfInIn;
  }

  public void translateToMap() {
    if (nedfIn != null) {
      nedfIn.resetFlags(true, true);
      addInput("Nrc", NrcObjectBaseKeyHelper.toMap(nedfIn, new HashMap(), "NrcObjectBaseKeyData").get("NrcObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the Nrc
 * @param nedfInIn Value of the nedfIn
 *
 */

  public void setNrc(NrcObjectBaseKeyData nedfInIn) {
    nedfIn = nedfInIn;
  }

  public void translateFromMap() {
    nedfIn = NrcObjectBaseKeyHelper.fromMap(inputMap, "Nrc");
  }

/**
 *
 * Gets the Nrc
 * @return Value of the Nrc
 *
 */

  public NrcObjectBaseKeyData getNrc( ) {
    return nedfIn;
  }

}
