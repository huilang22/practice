/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DocumentTypeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a DocumentTypeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class DocumentTypeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DocumentTypeObjectKeyData DocTypedelete_In;
/**
 *
 * Constructor to create a  DocumentTypeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DocumentTypeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, DocumentTypeObjectKeyData DocTypedelete_InIn) {
    super(id, context, "DocumentTypeDelete");
    DocTypedelete_In = DocTypedelete_InIn;
  }

  public void translateToMap() {
    if (DocTypedelete_In != null) {
      DocTypedelete_In.resetFlags(true, true);
      addInput("DocumentType", DocumentTypeObjectKeyHelper.toMap(DocTypedelete_In, new HashMap(), "DocumentTypeObjectKeyData").get("DocumentTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the DocumentType
 * @param DocTypedelete_InIn Value of the DocTypedelete_In
 *
 */

  public void setDocumentType(DocumentTypeObjectKeyData DocTypedelete_InIn) {
    DocTypedelete_In = DocTypedelete_InIn;
  }

  public void translateFromMap() {
    DocTypedelete_In = DocumentTypeObjectKeyHelper.fromMap(inputMap, "DocumentType");
  }

/**
 *
 * Gets the DocumentType
 * @return Value of the DocumentType
 *
 */

  public DocumentTypeObjectKeyData getDocumentType( ) {
    return DocTypedelete_In;
  }

}
