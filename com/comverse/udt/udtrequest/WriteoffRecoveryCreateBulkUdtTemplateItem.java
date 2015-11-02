/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WriteoffRecoveryCreateBulkUdtTemplateItem.java
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
 * Class used to create a WriteoffRecoveryCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class WriteoffRecoveryCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected WriteoffObjectData WRITEOFFcreateIn;
/**
 *
 * Constructor to create a  WriteoffRecoveryCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public WriteoffRecoveryCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, WriteoffObjectData WRITEOFFcreateInIn) {
    super(id, context, "WriteoffRecoveryCreate");
    WRITEOFFcreateIn = WRITEOFFcreateInIn;
  }

  public void translateToMap() {
    if (WRITEOFFcreateIn != null) {
      WRITEOFFcreateIn.resetFlags(true, true);
      addInput("Writeoff", WriteoffObjectHelper.toMap(WRITEOFFcreateIn, new HashMap(), "Writeoff").get("Writeoff"));
    }
  }


/**
 *
 * Sets the Writeoff
 * @param WRITEOFFcreateInIn Value of the WRITEOFFcreateIn
 *
 */

  public void setWriteoff(WriteoffObjectData WRITEOFFcreateInIn) {
    WRITEOFFcreateIn = WRITEOFFcreateInIn;
  }

  public void translateFromMap() {
    WRITEOFFcreateIn = WriteoffObjectHelper.fromMap(inputMap, "Writeoff");
  }

/**
 *
 * Gets the Writeoff
 * @return Value of the Writeoff
 *
 */

  public WriteoffObjectData getWriteoff( ) {
    return WRITEOFFcreateIn;
  }

}
