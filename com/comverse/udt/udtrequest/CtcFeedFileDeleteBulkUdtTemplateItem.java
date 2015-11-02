/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFeedFileDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * Class used to create a CtcFeedFileDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcFeedFileDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcFeedFileObjectKeyData DeleteIn;
/**
 *
 * Constructor to create a  CtcFeedFileDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcFeedFileDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcFeedFileObjectKeyData DeleteInIn) {
    super(id, context, "CtcFeedFileDelete");
    DeleteIn = DeleteInIn;
  }

  public void translateToMap() {
    if (DeleteIn != null) {
      DeleteIn.resetFlags(true, true);
      addInput("CtcFeedFile", CtcFeedFileObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcFeedFileObjectKeyData").get("CtcFeedFileObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcFeedFile
 * @param DeleteInIn Value of the DeleteIn
 *
 */

  public void setCtcFeedFile(CtcFeedFileObjectKeyData DeleteInIn) {
    DeleteIn = DeleteInIn;
  }

  public void translateFromMap() {
    DeleteIn = CtcFeedFileObjectKeyHelper.fromMap(inputMap, "CtcFeedFile");
  }

/**
 *
 * Gets the CtcFeedFile
 * @return Value of the CtcFeedFile
 *
 */

  public CtcFeedFileObjectKeyData getCtcFeedFile( ) {
    return DeleteIn;
  }

}
