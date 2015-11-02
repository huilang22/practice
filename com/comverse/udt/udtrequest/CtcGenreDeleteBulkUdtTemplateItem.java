/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcGenreDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CtcGenreDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcGenreDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcGenreObjectKeyData DeleteIn;
/**
 *
 * Constructor to create a  CtcGenreDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcGenreDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcGenreObjectKeyData DeleteInIn) {
    super(id, context, "CtcGenreDelete");
    DeleteIn = DeleteInIn;
  }

  public void translateToMap() {
    if (DeleteIn != null) {
      DeleteIn.resetFlags(true, true);
      addInput("CtcGenre", CtcGenreObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcGenreObjectKeyData").get("CtcGenreObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcGenre
 * @param DeleteInIn Value of the DeleteIn
 *
 */

  public void setCtcGenre(CtcGenreObjectKeyData DeleteInIn) {
    DeleteIn = DeleteInIn;
  }

  public void translateFromMap() {
    DeleteIn = CtcGenreObjectKeyHelper.fromMap(inputMap, "CtcGenre");
  }

/**
 *
 * Gets the CtcGenre
 * @return Value of the CtcGenre
 *
 */

  public CtcGenreObjectKeyData getCtcGenre( ) {
    return DeleteIn;
  }

}
