/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WriteoffGetBulkUdtTemplateItem.java
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
 * Class used to create a WriteoffGetBulkUdtTemplateItem Bulk Template
 *
 */

public class WriteoffGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected WriteoffObjectKeyData WRITEOFFgetIn;
/**
 *
 * Constructor to create a  WriteoffGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public WriteoffGetBulkUdtTemplateItem(String id, BSDMSessionContext context, WriteoffObjectKeyData WRITEOFFgetInIn) {
    super(id, context, "WriteoffGet");
    WRITEOFFgetIn = WRITEOFFgetInIn;
  }

  public void translateToMap() {
    if (WRITEOFFgetIn != null) {
      WRITEOFFgetIn.resetFlags(true, true);
      addInput("Writeoff", WriteoffObjectKeyHelper.toMap(WRITEOFFgetIn, new HashMap(), "WriteoffObjectKeyData").get("WriteoffObjectKeyData"));
    }
  }


/**
 *
 * Sets the Writeoff
 * @param WRITEOFFgetInIn Value of the WRITEOFFgetIn
 *
 */

  public void setWriteoff(WriteoffObjectKeyData WRITEOFFgetInIn) {
    WRITEOFFgetIn = WRITEOFFgetInIn;
  }

  public void translateFromMap() {
    WRITEOFFgetIn = WriteoffObjectKeyHelper.fromMap(inputMap, "Writeoff");
  }

/**
 *
 * Gets the Writeoff
 * @return Value of the Writeoff
 *
 */

  public WriteoffObjectKeyData getWriteoff( ) {
    return WRITEOFFgetIn;
  }

}
