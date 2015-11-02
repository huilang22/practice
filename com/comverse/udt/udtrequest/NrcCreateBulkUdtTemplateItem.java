/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcCreateBulkUdtTemplateItem.java
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
 * Class used to create a NrcCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcObjectBaseData NrcCreateIn;
/**
 *
 * Constructor to create a  NrcCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcObjectBaseData NrcCreateInIn) {
    super(id, context, "NrcCreate");
    NrcCreateIn = NrcCreateInIn;
  }

  public void translateToMap() {
    if (NrcCreateIn != null) {
      NrcCreateIn.resetFlags(true, true);
      addInput("Nrc", NrcObjectBaseHelper.toMap(NrcCreateIn, new HashMap(), "Nrc").get("Nrc"));
    }
  }


/**
 *
 * Sets the Nrc
 * @param NrcCreateInIn Value of the NrcCreateIn
 *
 */

  public void setNrc(NrcObjectBaseData NrcCreateInIn) {
    NrcCreateIn = NrcCreateInIn;
  }

  public void translateFromMap() {
    NrcCreateIn = NrcObjectBaseHelper.fromMap(inputMap, "Nrc");
  }

/**
 *
 * Gets the Nrc
 * @return Value of the Nrc
 *
 */

  public NrcObjectBaseData getNrc( ) {
    return NrcCreateIn;
  }

}
